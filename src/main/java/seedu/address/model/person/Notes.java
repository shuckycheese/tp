package seedu.address.model.person;
import static java.util.Objects.requireNonNull;
/**
 * Represents a Patient's notes in WardWatch.
 * Guarantees: immutable; is always valid
 */
public class Notes {
    public final String notes;
    public Notes(String patientNotes) {
        requireNonNull(patientNotes);
        notes = patientNotes;
    }
    @Override
    public String toString() {
        return notes;
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Notes // instanceof handles nulls
                && notes.equals(((Notes) other).notes)); // state check
    }
    @Override
    public int hashCode() {
        return notes.hashCode();
    }
}