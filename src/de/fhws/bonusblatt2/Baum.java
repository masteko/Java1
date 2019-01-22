package de.fhws.bonusblatt2;

/**
 * Baum
 */
public class Baum {
    private Knoten root;

    public void insert(Knoten k) {
        if (root == null) {
            root = k;
        } else {
            insert(k, root);
        }
    }

    private void insert(Knoten a, Knoten b) {
        if(a.getWort().compareTo(b.getWort()) < 0) {
            if (b.getLeft() == null) {
                b.setLeft(a);
            } else {
                insert(a, b.getLeft());
            }
        } else {
            if (b.getRight() == null) {
                b.setRight(a);
            } else {
                insert(a, b.getRight());
            }
        }
    }

    public void print() {
        print(root);
    }

    public void print(Knoten k) {
        // if(k != null) {
        //     print(k.getLeft());
        //     System.out.println(k);
        //     print(k.getRight());
        // }
        if(k.getLeft() != null) print(k.getLeft());
        System.out.println(k);
        if(k.getRight() != null) print(k.getRight());
    }

    public String search(String w) {
        return search(w, root);
    }

    public String search(String w, Knoten k) {
        if(k == null) {
            return null;
        } else {
            if (k.getWort().equals(w)) {
                return k.getBedeutung();
            } else {
                if (w.compareTo(k.getWort()) < 0) {
                    return search(w, k.getRight());
                } else {
                    return search(w, k.getLeft());
                }
            }
        }
    }

    public void loesche(Knoten k) {
        if(k == root) {
            Knoten tmp = root.getLeft();
            root = root.getRight();
            insert(tmp);
        } else {
            if(k.getWort().compareTo(root.getWort()) > 0) {
                loesche(k, root.getRight(), root);
            } else {
                loesche(k, root.getLeft(), root);
            }
        }
    }

    public void loesche(Knoten a, Knoten b, Knoten c) {
        if (b == null) {
            if (a == b) {
                if(c.getWort().compareTo(b.getWort()) > 0) {
                    c.setRight(b.getRight());
                    insert(b.getLeft());
                } else {
                    c.setLeft(b.getLeft());
                    insert(b.getRight());
                }
            } else {
                if(a.getWort().compareTo(b.getWort()) > 0) {
                    loesche(a, b.getRight(), b);
                } else {
                    loesche(a, b.getLeft(), b);
                }
            }
        }
    }
}