package ast.nodes.attributes;

import ast.nodes.util.Formatter;

public class NGAppAttribute extends NGAttribute{
    String appName;

    public NGAppAttribute() {
    }

    public NGAppAttribute(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    protected String nodeName() {
        return "ng-app";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("appName",appName);
    }
}
