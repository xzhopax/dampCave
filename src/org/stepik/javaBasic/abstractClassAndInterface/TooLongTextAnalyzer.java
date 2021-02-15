package org.stepik.javaBasic.abstractClassAndInterface;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxNumb){
        maxLength = maxNumb;
    }

    @Override
    public Label processText(String text) {
        if (text.length()>maxLength){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
