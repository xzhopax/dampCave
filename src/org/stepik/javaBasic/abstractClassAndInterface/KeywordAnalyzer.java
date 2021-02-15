package org.stepik.javaBasic.abstractClassAndInterface;

public abstract class KeywordAnalyzer
{

    abstract String [] getKeywords();
    abstract Label getLabel ();


    public Label processText(String text) {
        return Label.OK;
    }

}
