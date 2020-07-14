package cafe.props;

public enum Size {
    SMALL(150),
    MEDIUM(250),
    LARGE(300);

    private long volumeInMl;

    Size(long volumeInMl) {
        this.volumeInMl = volumeInMl;
    }

    public long getVolumeInMl() {
        return volumeInMl;
    }
}
