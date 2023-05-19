package Task9;

import static java.lang.System.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class GameApp {
	private List<SportsLegend> legendList;
	public GameApp(String filename) throws IOException {
		legendList = new LinkedList<>();
		readData(filename);
	}
	//Reads data from .txt file
	public void readData(String filename) throws IOException {
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			int born = Integer.parseInt(items[1]);
			String bio = items[2];
			SportsLegend s = new SportsLegend(name, born, bio);
			legendList.add(s);
		}
	}
	//Primary game function. Uses information from .txt file to generate questions
	public void game() {
		Random rand = new Random();
		Scanner input = new Scanner(in);
		Boolean correct = false;
		int randomLegend = rand.nextInt(legendList.size());
		SportsLegend guessLegend = legendList.get(randomLegend);
		for(int i = 0; i < 3; i++) {
			out.printf("You have %d guesses left.\n",(3-i));
			out.printf("What year was %s born in?\n", (guessLegend.getName()));
			int userGuess = Integer.parseInt(input.nextLine());
			if (userGuess == guessLegend.getBornYear()) {
				out.println("Correct!\n");
				correct = true;
				break;
			} else {
				out.println("Wrong answer, sorry. Try again.");
			}
		}
		if (correct) {
			out.println("Your answer is correct! Well done!");
		} else {
			out.println("Wrong! Game over! You lose!");
		}

	}
	//Secondary game function. Reads user input to play again
	public void repeatGame() {
		Scanner input = new Scanner(in);
		while(true) {
			game();//play a game
			out.print("Play again? (y/n): ");
			if(input.nextLine().equalsIgnoreCase("n")) {
				out.println("Bye.");
				return;
			}
		}
	}
}
