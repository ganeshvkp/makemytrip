Feature: Testing for MakemyTrip Application
  
    Scenario: Book cheapest bus
     Given User Enter the MakemyTrip url
     Then Close the Login window
     Then Click the bus 
     Then Enter pickup and drop location
     And Pick date and search the buses
     Then Filter the buses
     Then Click cheapest and get the lowest price bus
     Then Click select seat
     Then Pick any berth to reserve the seat and click continue
     Then Enter the Traveller details and click continue to payment page