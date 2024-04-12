# BDD Test for Amazon Login and Logout

This project applies Behavior Driven Development (BDD) testing to the Amazon login and logout functionality with valid credentials.

## Project Structure

![img](https://github.com/Vio-ss/Assessment-1/assets/77194486/d5f7f038-c9be-4c5c-a60a-4b7b7ec99f4e)

## Getting Started

To get started with the project, follow these instructions:

### Prerequisites

Install a BDD framework (e.g., Cucumber) in your testing environment.

### Test Execution

1. Create step definitions for each step in the feature file.

2. Execute the BDD test using the configured BDD framework.

## Feature File

```gherkin
@tag
Feature: As an Amazon user, I should be able to login and logout with valid credentials

  @tag1
  Scenario: Check homepage
    Given user is on the home page 
    When user clicks on sign-in
    Then user enters login details and continues
    And user is on the cart page 
    When user deletes cart items if present
    And user is on the products page 
    When user chooses Electronics and headphones
    And user adds the top result to the cart
    Then user searches for "Macbook pro"
    And user adds the second available item to the cart
    And user returns to the cart page
    When user removes headphones and reduces the Macbook pro quantity
    And user clicks checkout
    Then user clicks on their account
    And user signs out
