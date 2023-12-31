package com.olegnew.jvcboxmanagerv1.model.cbox;

import lombok.Data;

@Data
public class Element {
    private String oid;
    private String name;
    private String dataType;
    private boolean rewritable;
    private boolean usability;

    @Override
    public String toString() {
        return "Element{"
                + "oid='" + oid + '\n'
                + "name='" + name + '\n'
                + "rewritable=" + rewritable + '\n'
                + "usability=" + usability + '\n'
                + '}';
    }
}
