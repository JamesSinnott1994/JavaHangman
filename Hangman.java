public class Hangman {

  public static void main(String[] args) {
    if( args.length == 0 ) {
      System.out.println("Usage: Java Hangman <answer>");
      System.err.println("answer is required");
      System.exit(1);
    }
    
    // Your incredible code goes here...
    Game game = new Game(args[0]);
    Prompter prompter = new Prompter(game);
    
    while (game.getRemainingTries() > 0 && !game.isWon()) {
      prompter.displayProgress();
      boolean isHit = prompter.promptForGuess();
    }
    prompter.displayOutcome();
  }
}