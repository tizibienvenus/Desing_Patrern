from abc import ABC, abstractmethod


# Abstract Factory
class AbstractFactory(ABC):
    @abstractmethod
    def create_test(self):
        pass

    @abstractmethod
    def create_equipement(self):
        pass


class RapidTestFactory(AbstractFactory):
    def create_test(self):
        return RapidTest()

    def create_equipement(self):
        return Microscope()


class LabTestFactory(AbstractFactory):
    def create_test(self):
        return LabTest()

    def create_equipement(self):
        return Centrifuge()


# Composite
class EquipementComponent(ABC):
    def add(self, equipement_component):
        raise NotImplementedError()

    def remove(self, equipement_component):
        raise NotImplementedError()

    def get_child(self, i):
        raise NotImplementedError()

    @abstractmethod
    def display_info(self):
        pass


class Equipement(EquipementComponent):
    def __init__(self, name):
        self.name = name

    def display_info(self):
        print(self.name)


class EquipementComposite(EquipementComponent):
    def __init__(self):
        self.components = []

    def add(self, equipement_component):
        self.components.append(equipement_component)

    def remove(self, equipement_component):
        self.components.remove(equipement_component)

    def get_child(self, i):
        return self.components[i]

    def display_info(self):
        for component in self.components:
            component.display_info()


# Test Interface and Implementations
class Test(ABC):
    @abstractmethod
    def perform_test(self):
        pass


class BasicTest(Test):
    def perform_test(self):
        print("Performing basic test.")


class RapidTest(Test):
    def perform_test(self):
        print("Performing rapid test.")


class LabTest(Test):
    def perform_test(self):
        print("Performing lab test.")


class Microscope(Equipement):
    def __init__(self):
        super().__init__("Microscope")


class Centrifuge(Equipement):
    def __init__(self):
        super().__init__("Centrifuge")


# Decorator
class TestDecorator(Test):
    def __init__(self, decorated_test):
        self.decorated_test = decorated_test

    def perform_test(self):
        self.decorated_test.perform_test()


class AdvancedTestDecorator(TestDecorator):
    def perform_test(self):
        self.decorated_test.perform_test()
        self.perform_advanced_test()

    def perform_advanced_test(self):
        print("Performing advanced test.")


# Observer
class Observer(ABC):
    @abstractmethod
    def update(self, result):
        pass


class Medecin(Observer):
    def __init__(self, name):
        self.name = name

    def update(self, result):
        print(f"Medecin {self.name} notified of test result: {result}")


class TestSubject:
    def __init__(self):
        self.observers = []
        self.result = None

    def add_observer(self, observer):
        self.observers.append(observer)

    def remove_observer(self, observer):
        self.observers.remove(observer)

    def set_result(self, result):
        self.result = result
        self.notify_all_observers()

    def notify_all_observers(self):
        for observer in self.observers:
            observer.update(self.result)


# Strategy
class TestStrategy(ABC):
    @abstractmethod
    def process_result(self, result):
        pass


class SimpleProcessing(TestStrategy):
    def process_result(self, result):
        print(f"Processing result simply: {result}")


class DetailedProcessing(TestStrategy):
    def process_result(self, result):
        print(f"Processing result in detail: {result}")


class TestProcessor:
    def __init__(self, strategy):
        self.strategy = strategy

    def set_strategy(self, strategy):
        self.strategy = strategy

    def process_result(self, result):
        self.strategy.process_result(result)


# Singleton
class Laboratoire:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Laboratoire, cls).__new__(cls)
        return cls._instance


# Main Execution
if __name__ == "__main__":
    # Singleton
    laboratoire = Laboratoire()

    # Abstract Factory
    factory = RapidTestFactory()
    test = factory.create_test()
    equipement = factory.create_equipement()

    # Observer
    medecin1 = Medecin("Dr. Doc Python")
    test_subject = TestSubject()
    test_subject.add_observer(medecin1)

    # Strategy
    processor = TestProcessor(SimpleProcessing())
    processor.process_result("Positive")

    # Set result and notify observers
    test_subject.set_result("Positive")

    # Decorator
    decorated_test = AdvancedTestDecorator(BasicTest())
    decorated_test.perform_test()

    # Composite
    composite = EquipementComposite()
    composite.add(Microscope())
    composite.add(Centrifuge())
    composite.display_info()
