package com.leetcode;

class Trie {
    Trie[] trie;
    boolean isEnd;
    /** Initialize your data structure here. */
    public Trie() {
        trie = new Trie[26];
        isEnd = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie temp = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (temp.trie[index] == null) {
                temp.trie[index] = new Trie();
            }
            temp = temp.trie[index];
        }
        temp.isEnd = true;
    }

    public Trie isPer(String str) {
        Trie temp = this;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (temp.trie[index] == null) {
                return null;
            }
            temp = temp.trie[index];
        }
        return temp;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie per = isPer(word);
        return per != null && per.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return isPer(prefix) != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */