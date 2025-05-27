package com.lab;

import java.util.HashMap;
import java.util.Map;


public class LoanRegistration {
    private static Map<Integer, String> registeredUsers = new HashMap<>();
    private static int userIdCounter = 1;

    // Task 1: registerLoan
    public static synchronized String registerLoan(String userName, double loanAmount) {
        /* TODO 1: use Amazon Q Developer to analyze if the userName check is sufficient.
            Look for potential issues like missing a null check before calling .isEmpty().
            Fix this by adding a null check and returning "Error: User name cannot be null or empty" if userName is invalid.
        */
        if (userName == null || userName.isEmpty()) {
            return "Error: User name cannot be null or empty";
        }

        if (isDuplicateUserName(userName)) {
            return "Error: User name already exists";
        }

        /* TODO 2: validate with Amazon Q Developer to check the logic for loanAmount.
            Make sure the amount is greater than 0 and return "Error: Loan amount must be greater than zero" if it isn’t.
        */
        if (loanAmount <= 0) {
            return "Error: Loan amount must be greater than zero";
        }
        int userId = userIdCounter++;
        /* TODO 3: use Amazon Q Developer to check how to add a user to the registeredUsers map.
            Complete this by using userId as the key and userName as the value to store and track the user.
        */
        registeredUsers.put(userId, userName);
        return "Loan registered successfully for User: " + userName + ", User ID: " + userId;
    }

    // Task 2: getUserById
    public static String getUserById(int userId) {
        /* TODO 4: use Amazon Q Developer's Explain or Fix feature to identify how to check if userId exists in the registeredUsers map.
            Complete this by returning "Error: User ID not found" if the userId is missing.
        */
        if (!registeredUsers.containsKey(userId)) {
            return "Error: User ID not found";
        }
        /* TODO 5: use Amazon Q Developer's Refactor or Explain feature to guide you in retrieving the userName from registeredUsers.
            Complete this by returning a message like "User found: [userName]" if the userId exists.
        */
        String userName = registeredUsers.get(userId);
        return "User found: " + userName;
    }

    // Task 3: isDuplicateUserName
    public static boolean isDuplicateUserName(String userName) {
        // TODO 6: use Amazon Q Developer's Explain feature to learn how to iterate through the registeredUsers map. Complete this by checking if `userName` already exists in the map.
        for (String registeredUser : registeredUsers.values()) {
            // TODO 7: use Amazon Q Developer's Refactor feature to guide you in comparing registeredUser with userName. Complete this by using the equals() method and returning true if a match is found.
            if (registeredUser.equals(userName)) {
                return true;
            }
        }
        /* TODO 8: use Amazon Q Developer's Fix feature to ensure the method
            returns false if no duplicate userName is found after iterating through the map.*/
        return false;
    }

    // Task 4: updateUserName
    public static String updateUserName(int userId, String newUserName) {
        /* TODO 9: start by using Amazon Q Developer's Explain option to analyze how to check if userId exists in
            the registeredUsers map.
            Once you understand the logic, use the Fix option to implement it.
            Return "Error: User ID not found" if the userId is missing.
        */
        if (!registeredUsers.containsKey(userId)) {
            return "Error: User ID not found";
        }

        /* TODO 10: use Amazon Q Developer's Explain option to understand how to validate newUserName.
            Use the Fix option to add logic that checks if `newUserName` is null or empty and returns "Error: User name cannot be null or empty" if needed.
        */
        if (newUserName == null || newUserName.isEmpty()) {
            return "Error: User name cannot be null or empty";
        }

        /* TODO 11: analyze the logic for checking duplicate user names using Amazon Q Developer's Explain option.
            Use the Fix option to implement the check by calling isDuplicateUserName() and
             return "Error: User name already exists" if a duplicate is found.
        */
        if (isDuplicateUserName(newUserName)) {
            return "Error: User name already exists";
        }

        /* TODO 12: start by using Amazon Q Developer's Explain option to understand how to update the userName in the
            registeredUsers map for the given userId.
            Then, use the Fix option to correctly assign newUserName to the corresponding userId in the map.
        */
        registeredUsers.put(userId, newUserName);
        /* TODO 13: use Amazon Q Developer's Explain option to review how to format a success message.
            Once you understand the structure, use the Refactor option to create a clean and readable success message like
            "User name updated successfully for User ID: [userId]".
        */

        return "User name updated successfully for User ID: " + userId;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(registerLoan(null, 5000)); // Invalid: Null userName (Expected to fail)
        System.out.println(registerLoan("", 5000)); // Invalid: Empty userName
        System.out.println(registerLoan("Alice", -2000)); // Invalid: Negative loanAmount
        System.out.println(registerLoan("Bob", 0)); // Invalid: Zero loanAmount
        System.out.println(registerLoan("Bob", 3000)); // Valid: Successful registration
        System.out.println(registerLoan("Bob", 4000)); // Invalid: Duplicate userName

        System.out.println(getUserById(1)); // Placeholder: Incomplete logic
        System.out.println(getUserById(99)); // Invalid: User ID not found

        System.out.println(isDuplicateUserName("Alice")); // Placeholder: Incomplete logic
        System.out.println(isDuplicateUserName("Bob")); // Placeholder: Incomplete logic

        System.out.println(updateUserName(1, "Shaun")); // Placeholder: Incomplete logic
        System.out.println(updateUserName(3, "Mary")); // Invalid: User ID not found
    }
}




