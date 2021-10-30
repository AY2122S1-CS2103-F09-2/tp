package seedu.address.logic.parser;

import seedu.address.logic.commands.Command;
import seedu.address.logic.parser.exceptions.ParseException;

public interface Parser<T extends Command> {
    /**
     * Parses {@code userInput} into a command and returns it.
     * @throws ParseException if {@code userInput} does not conform to the expected format
     */
    T parse(String userInput) throws ParseException;
}
