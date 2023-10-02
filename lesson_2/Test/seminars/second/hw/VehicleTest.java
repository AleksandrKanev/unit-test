package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    static Car car;
    static Motorcycle motorcycle;

    @BeforeAll
    static void setup() {
        motorcycle = new Motorcycle("Yamaha", "R1", 2013);
        car = new Car("Dodge", "Ram", 2010);
    }
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        assertTrue(motorcycle instanceof Vehicle);
    }
    @Test
    public void testCarFourWheels(){
        assertEquals(4,car.getNumWheels());
    }

    @Test
    public void testMotorcycleTwoWheels(){
        assertEquals(2,motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeed(){
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }
    @Test
    public void testMotorcycleSpeed(){
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

    @Test
    public void testCarPark(){
        car.park();
        assertEquals(0,car.getSpeed());
    }
    @Test
    public void testMotorcyclePark(){
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }


}