# Snap

A Java terminal interpretation based on the card game **Snap**, using OOP. Created as portfolio project number 3 for *
*nology**.

## Snap Overview

Snap is a 2-player card game, where a card is drawn from the top of the deck and placed facing upwards. The players must
pay attention to the cards, yelling "Snap!" and placing their hand down on the pile when two cards of the same value
have been placed on top of each other. In this implementation, the Java terminal is used, allowing the user two seconds
to type "snap" in order to win the game.

## Using Snap

To use Snap, you will need to clone this repository to your own machine.

1. Click the green "Code" button at the top of the repository. This will reveal a dropdown providing the cloning links.
2. Choose your preferred method: HTTPS, SSH or GitHub CLI.
3. For HTTPS or SSH, copy the URL.
4. In your terminal, use `git clone` followed by the URL. This will clone the repository to your machine.
5. Now the repository is ready to use.

To play, make sure you are in `SnapGameMain.java` before running the application.

- Click the green arrow at the top of the IDE to run the application, or alternatively press ^F5.

### Playing Higher or Lower

Using OOP logic, a second game - **Higher or Lower** has been created also. To play, make sure you are in
`HigherLowerGameMain.java` before running the application.

## Contributing to Snap

To contribute to Snap, follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <branch_name>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Push to the original branch: `git push origin java-snap/<location>`
5. Create the pull request.

Alternatively see the GitHub documentation
on [creating a pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## Further Improvements

- [ ] Create a user control flow from a single source (eg, `Main.java`) to allow user to choose which game to play
- [ ] In `SnapGameMain.java`, create a timer for player to enter *"snap"* rather than comparing elapsed time
- [ ] Add **JUnit** testing to ensure higher confidence in code
