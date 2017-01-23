# how_many_in_jar_game
Console based implementation of "How many in jar" game.

Project was implemented using directions from simulated user stories.
Stories were as noted bellow:

1. As an administrator of the game I should be able to specify what type of
item will be stored in the jar as well as the total how many could
reasonably fit in jar, so that the game stays in the bounds of reality.

2. As a player of the game, each game I should be presented with a randomly
filled jar so that I can play multiple games and it is still
challenging.

3. As a player of the game, I should be displayed with the maximum amount
of items that are possible to be in the jar.

4. As a player of the game, I should be able to guess the number of the
items until I get the correct answer.

5. As a winner of the game, I should know how many attempts it took me to
get to the right answer, so that I am encouraged to beat my score, eg
"You got it in X attempt(s)".

6. As a player of the game, I should know if my guess is too high or too
low, so that I can improve my answers and be encouraged to improve.

Used MVP (minimal viable product) philosophy when creating application, additional features added later such as:
- Prevents from guessing over the maximum amount.
- User is warned and prompted “Your guess must be less than maximum fill
amount”
- Over the maximum guesses should not counted against number of tries.
- Added fail-safe against administrator provaiding zero capacity jar.
- Moved business logic to Game class to further separate model from view.

To check my other work please go to:
To check my work that follows more closely to "clean code" please check my other repositories such as:
- https://github.com/grzegorzkonczak/instateam-with-spring-and-hibernate - Project team management web application using Spring with Hibernate.
- https://github.com/grzegorzkonczak/analyze-public-data-with-hibernate - Console application for managing Countries data using Hibernate and H2 file database. Edit
- https://github.com/grzegorzkonczak/personal-blog - Simple web blog application built using Spark Framework
- https://github.com/grzegorzkonczak/todo-api-with-spark - REST API for "TODO" application using Spark framework
