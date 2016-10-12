package com.SuperTrumps;

import com.dd.plist.NSString;

public class TrumpCard extends Card {

    String fileName, title, subtitle;

    public TrumpCard(NSString fileName, NSString title, NSString subtitle) {
        this.fileName = fileName.toString();
        this.title = title.toString();
        this.subtitle = subtitle.toString();
        this.isTrump = true;
    }

    @Override
    public String toString() {
        return ("\n**************************************************" +
                "\nSUPERTRUMP\n" + this.title +
                "\n\nABILITY \n" + this.subtitle +
                "\n**************************************************\n");
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}