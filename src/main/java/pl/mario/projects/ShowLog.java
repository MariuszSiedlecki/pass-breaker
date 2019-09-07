package pl.mario.projects;

public enum ShowLog {
    WITH_LOGS(true),
    WITHOUT_LOGS(false);

    private boolean flag;

    ShowLog(boolean flag) {
        this.flag = flag;
    }

    public boolean showValue() {
        return flag;
    }
}
