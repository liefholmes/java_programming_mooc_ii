/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author liefh
 */
import java.util.HashMap;
import java.util.Set;
import java.io.PrintWriter;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileWriter;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() throws Exception{
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }

    }

    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file);
            for (String s : this.dictionary.keySet()) {
                String word = s;
                String translation = this.dictionary.get(s);
                pw.println(s + ":" + translation);
            }
            pw.close();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public void add(String words, String translation) {
        if (dictionary.containsKey(words)) {
            return;
        }
        this.dictionary.put(words, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        if (this.dictionary.containsValue(word)) {
            Set<String> keySet = this.dictionary.keySet();
            for (String key : keySet) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
        if (this.dictionary.containsValue(word)) {
            String target = "";
            Set<String> keySet = this.dictionary.keySet();
            for (String key : keySet) {
                if (this.dictionary.get(key).equals(word)) {
                    target = key;
                }
            }
            this.dictionary.remove(target);
        }
    }

}
