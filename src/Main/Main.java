package Main;

import PatternA.PatternAcategory;
import PatternB.PatternBcategory;
import PatternCpyramid.PatternCcategory;
import PatternDpyramid.PatternDcategory;

public class Main {
    public static void main(String[] args) {
        PatternAcategory printA = new PatternAcategory();
        PatternBcategory printB = new PatternBcategory();
        PatternCcategory printC = new PatternCcategory();
        PatternDcategory printD = new PatternDcategory();

        printA.pattern1(5);
    }
}
