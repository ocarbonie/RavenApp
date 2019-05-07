package com.company;
import java.util.ArrayList;

public class NatureOf {
    ArrayList<String> theraTalk = new ArrayList<>();
    String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative", "interesting", "love"};
    String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid", "hate"};
    Record record = new Record();

    //Scans answer for positive or negative words
    public void analyzeThis(String m) {
        record.setRecording(m);
        int pos = 0;
        int neg = 0;
        String[] strArr = m.split(" ");
        for (int i = 0; i < positive.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (positive[i].equalsIgnoreCase(strArr[j])) {
                    pos++;
                } else if (negative[i].equalsIgnoreCase(strArr[j])) {
                    neg++;
                }
            }
        }
//        System.out.println("positive words count: "+ pos);
//        System.out.println("negative words count: "+ neg);

        if (pos > neg) {
            System.out.println(sarcasmOn());
        } else if (neg == pos) {
            System.out.println(interestOff());
        } else {
            System.out.println(interestOn());
        }

    }

    public String sarcasmOn() {
        String m = "Wow, congrats! Must be great being you!";
        record.setRecording(m);
        return m;
    }

    public String interestOff() {
        String k = "Meh, so not much going on!!!";
        record.setRecording(k);
        return k;

    }

    public String interestOn() {
        String l = "Ooooh, how interesting...Tell me more!";
        record.setRecording(l);
        return l;

    }

    public void recordIt(String m) {
        record.setRecording(m);
    }

    public String getConvo() {
        String s= " ";
        theraTalk = record.getRecording();
        for (String m : theraTalk) {
//            s += m + "\n";
            System.out.println(m);
        }
        return s;
    }
}
//        String s = "printing history: \n";
//        for(String m: theraTalk){
//            s += m + "\n";
//            System.out.println(m);
//        }
//        return s;
//    }
//}
