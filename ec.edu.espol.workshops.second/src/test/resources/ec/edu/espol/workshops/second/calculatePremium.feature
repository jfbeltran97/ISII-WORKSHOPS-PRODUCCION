Feature: calculate the premium

Scenario Outline: The customer is valid
	Given the customer is "<sex>"
	And married is <married>
	And age is <age>
	When calculating the premium
	Then I should be told <answer>

Examples:
	| sex  | married   | age | answer |
	| F    | false     | 16  | 300    |
	| M    | true      | 30  | 300    |