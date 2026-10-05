class LRUCache {
    private int capacity; 
    private Map<Integer, Integer> map; //uses access order such that last recently used element moves to the front 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        int value = map.getOrDefault (key , -1);
        return value;
    }
    
    public void put(int key, int value) {
        map.put(key, value);

        if (map.size() > capacity ) { //check if the size is bigger than the capacity so we evict the least recently used
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            it.next();      // first entry = least recently used
            it.remove();    // evict it
        }
     }   
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */