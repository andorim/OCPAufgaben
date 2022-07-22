package de.andorim.OCP.main.ClassDesign.InterfacesComparable;

public class OS implements Comparable<OS> {
    String name;
    int version;

    public OS(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int compareTo(OS o) {
        if ((this.name.compareTo(o.name) == 0)) {
            return Integer.compare(this.version, o.version);
        } else {
            return this.name.compareTo(o.name);
        }
    }

    public String toString() {
        return String.format("| %1$10s | %2$3s |\n", this.name, this.version);
    }
}
