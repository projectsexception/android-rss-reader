package com.projectsexception.rssreader.model;

public enum FeedType {
    RSS("rss", "item", "pubDate", "description", "enclosure"),
    RDF("RDF", "item", "date", "description", null),
    ATOM("feed", "entry", "updated", "content", "thumbnail");
    
    private String rootElement;
    private String rootTitleElement;
    private String rootLinkElement;
    private String entryElement;
    private String entryTitleElement;
    private String entryUpdateElement;
    private String entryLinkElement;
    private String entrySummaryElement;
    private String imageElement;

    private FeedType(String rootElement, String entryElement, String entryUpdateElement, String entrySummaryElement, String imageElement) {
        this.rootElement = rootElement;
        this.rootTitleElement = "title";
        this.rootLinkElement = "link";
        this.entryElement = entryElement;
        this.entryTitleElement = "title";
        this.entryUpdateElement = entryUpdateElement;
        this.entryLinkElement = "link";
        this.entrySummaryElement = entrySummaryElement;
        this.imageElement = imageElement;
    }
    
    public String getRootElement() {
        return rootElement;
    }
    
    public String getEntryElement() {
        return entryElement;
    }
    
    public String getEntryUpdateElement() {
        return entryUpdateElement;
    }

    public String getRootTitleElement() {
        return rootTitleElement;
    }

    public String getRootLinkElement() {
        return rootLinkElement;
    }

    public String getEntryTitleElement() {
        return entryTitleElement;
    }

    public String getEntryLinkElement() {
        return entryLinkElement;
    }

    public String getEntrySummaryElement() {
        return entrySummaryElement;
    }

    public String getImageElement() {
        return imageElement;
    }
}
