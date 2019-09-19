
Feature: Work on Snapdeal

  Scenario: Add the prodcut to cart
    Given launch the browser and go to snapdeal website

    When search for hair dryer and click on it then click on add to cart option
    
    Then check url contains addToCart

  
