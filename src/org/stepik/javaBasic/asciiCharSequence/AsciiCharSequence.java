package org.stepik.javaBasic.asciiCharSequence;

public class AsciiCharSequence implements CharSequence {

    private final byte[] sequence;

    public AsciiCharSequence(byte[] byteArray) {
        sequence = byteArray;
    }

    public int length() {
        return sequence.length;
    }

    public char charAt(int index) {
        return (char) (int) sequence[index];
    }

    public AsciiCharSequence subSequence(int start, int end) {
        int len = end - start;
        byte[] newSequence = new byte[len];
        System.arraycopy(sequence, start, newSequence, 0,  len);
        return new AsciiCharSequence(newSequence);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        int len = this.length();
        for (int i = 0; i < len; i++) {
            result.append(charAt(i));
        }
        return result.toString();
    }
}
