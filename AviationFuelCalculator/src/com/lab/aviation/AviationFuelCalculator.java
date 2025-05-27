/**
 * Aviation software package for fuel calculations and flight planning.
 *
 * This package provides utilities and classes for aviation-related calculations,
 * specifically focused on fuel requirements for commercial aircraft operations.
 * It implements industry-standard formulas and safety checks for pre-flight planning.
 *
 * Key components:
 * - AviationFuelCalculator: Core class for computing fuel requirements based on:
 *   - Flight distance
 *   - Aircraft type (Boeing/Airbus)
 *   - Aircraft-specific fuel consumption rates
 *
 * Features:
 * - Precise fuel calculations using manufacturer-specified consumption rates
 * - Input validation for flight parameters
 * - Exception handling for safety-critical operations
 * - Support for major commercial aircraft manufacturers
 *
 * Usage:
 * The package is designed for aviation planning software to:
 * - Calculate minimum fuel requirements
 * - Validate flight parameters
 * - Ensure compliance with aviation safety standards
 *
 * @version 1.0
 */
package com.lab.aviation;
/**
 * A utility class for calculating aviation fuel requirements based on flight distance and aircraft type.
 * This class provides methods to compute fuel needs for commercial aircraft, specifically Boeing and Airbus models.
 *
 * Key features:
 * - Calculates fuel requirements based on aircraft-specific consumption rates
 * - Implements safety validation for distance and aircraft type parameters
 * - Supports Boeing aircraft (5.0 fuel units per distance unit)
 * - Supports Airbus aircraft (4.5 fuel units per distance unit)
 *
 * Safety considerations:
 * - Enforces positive distance values to prevent invalid calculations
 * - Validates aircraft types to ensure appropriate fuel consumption rates
 * - Throws exceptions for invalid inputs to maintain operational safety
 *
 * This class is critical for pre-flight planning and ensuring sufficient fuel loads
 * for safe commercial aviation operations.
 */

public class AviationFuelCalculator {
       /**
     * Calculates the required fuel for an aircraft journey based on distance and aircraft type.
     *
     * @param distance The flight distance in miles/kilometers. Must be greater than zero.
     * @param aircraftType The type of aircraft ("Boeing" or "Airbus"). Case-insensitive.
     * @return The calculated fuel requirement in gallons/liters based on aircraft-specific consumption rates:
     *         Boeing: 5.0 units per distance unit
     *         Airbus: 4.5 units per distance unit
     * @throws IllegalArgumentException if distance is less than or equal to zero
     * @throws IllegalArgumentException if aircraftType is neither "Boeing" nor "Airbus"
     */
    public static double calculateFuel(double distance, String aircraftType) {
        // Validate that distance is positive - negative or zero distances are invalid
        if (distance <= 0) {
            throw new IllegalArgumentException("Error: Distance must be greater than zero");
        }
        // Check if aircraft is Boeing type and calculate fuel using Boeing consumption rate (5.0)
        if (aircraftType.equalsIgnoreCase("Boeing")) {
            return distance * 5.0;
        }
        // Check if aircraft is Airbus type and calculate fuel using Airbus consumption rate (4.5)
        else if (aircraftType.equalsIgnoreCase("Airbus")) {
            return distance * 4.5;
        }
        // Throw exception if aircraft type is neither Boeing nor Airbus
        else {
            throw new IllegalArgumentException("Error: Invalid aircraft type");
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(calculateFuel(500, "Boeing"));
        System.out.println(calculateFuel(400, "Airbus"));
        try {
            System.out.println(calculateFuel(-100, "Unknown"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}



