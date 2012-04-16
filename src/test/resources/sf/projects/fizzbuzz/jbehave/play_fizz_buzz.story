Story: Play fizz-buzz
As a user
I would like to play fizz-buzz
So that I can learn how to calculate multiples

Scenario: When to fizz
Given a fizz-buzz player
When I ask to fizz-buzz for 3
Then I should get a fizz

Scenario: When to fizz-buzz
Given a fizz-buzz player
When I ask to fizz-buzz for <value>
Then I should get a <display>
 
Examples:     
|value|display|
|1|1|
|2|2|
|3|fizz|
|4|4|
|5|buzz|
|6|fizz|
|7|7|
|8|8|
|9|fizz|
|10|buzz|
|15|fizz-buzz|
|30|fizz-buzz|
