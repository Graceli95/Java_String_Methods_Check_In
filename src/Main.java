//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      FindStringSize findStringSize = new FindStringSize();
        findStringSize.findSize();

        StringComparison stringComparison = new StringComparison();
        stringComparison.compare();

        LexicographicalComparison lexicographicalComparison = new LexicographicalComparison();
        lexicographicalComparison.lexicographicalCompare();

        CheckPrefixAndSuffix checkPrefixAndSuffix = new CheckPrefixAndSuffix();
        checkPrefixAndSuffix.checkPrefixAndSuffix();
        FindFirstOccurrence findFirstOccurrence = new FindFirstOccurrence();
        findFirstOccurrence.findFirstOccurrence();

        CheckforSubstring checkforSubstring = new CheckforSubstring();
        checkforSubstring.checkSubstring();

        CodingChallenge codingChallenge = new CodingChallenge();
        codingChallenge.check();
    }
}