package io.collective;
import java.lang.String;
import java.lang.reflect.Array;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class SimpleAgedCache {

    // Completa
    private ExpirableEntry[] arr;
    private Clock clock;

    public SimpleAgedCache() {
        this.arr = [];
    }

    public SimpleAgedCache(Clock clock) {
        this.arr = [];
        //this.arr = ExpirableEntry();
        //[new ExpirableEntry('', '', 2)];
        this.clock = clock;
    }

    public void put(String key, String value, int money){
        int length = this.size();
        arr[length - 1] = new ExpirableEntry(key, value, money);
    }

    public String get(String keyPassed) {
        String value = "";
        String key;
        for (int i = 0; i < this.size(); i++) {
            key = this.arr[i].getKey();
            if (key.equals(keyPassed)) {
                value = this.arr[i].getValue();
                break;
            }
        }
        return value;
    }

    public int size(){
        int i = 0 ;
        while (this.arr[i] != null){
            i++;
        }
        return i;
    }

    public boolean isEmpty () {
        return (this.size() == 0) ? true : false;
    }

}

