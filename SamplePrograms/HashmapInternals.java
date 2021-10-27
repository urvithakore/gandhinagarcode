package apex.java.assign15.SamplePrograms;

public class HashmapInternals<K,V> {
	
		private Entry<K, V>[] buckets;
	    private static final int INITIAL_CAPACITY = 1 << 4; // 16

	    private int size = 0;

	    public HashmapInternals() {
	        this(INITIAL_CAPACITY);
	    }

	    public HashmapInternals(int capacity) {
	        this.buckets = new Entry[capacity];
	    }
	    
	    public int getHash(K Key)
	    {
	    	 int hash = (int) Key.hashCode();
	    	 if (hash < 0) return hash*(-1);
	    	 return hash;
	    }
	    
	    public int getBucketSize()
	    {
	    	return this.buckets.length;
	    }
	    
	    public int size()
	    {
	    	return this.size;
	    }	
	    
	   
	    
	    public void put(K key, V value) {
	        Entry<K, V> entry = new Entry<>(key, value, null);

	        int bucket = getHash(key) % getBucketSize();

	        Entry<K, V> existing = buckets[bucket];
	        if (existing == null) {
	            buckets[bucket] = entry;
	            size++;
	        } else {
	            // compare the keys see if key already exists
	            while (existing.next != null) {
	                if (existing.key.equals(key)) {
	                    existing.value = value;
	                    return;
	                }
	                existing = existing.next;
	            }

	            if (existing.key.equals(key)) {
	                existing.value = value;
	            } else {
	                existing.next = entry;
	                size++;
	            }
	        }
	    }  
	    
	    public V get(K key) {
	        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

	        while (bucket != null) {
	            if (key == bucket.key) {
	                return bucket.value;
	            }
	            bucket = bucket.next;
	        }
	        return null;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashmapInternals<String, String> myMap = new HashmapInternals<String,String>(16);
	    myMap.put("USA", "Washington DC");
	    myMap.put("Nepal", "Kathmandu");
	    myMap.put("India", "New Delhi");
	    myMap.put("Australia", "Sydney");
	    myMap.put("Ukrain", "Ukrain capital");

	    for(Entry bucket:myMap.buckets)
	    {
	    	if(bucket!=null) System.out.println(bucket.toString());
	    }
	    
	    System.out.println(myMap.size());
	    System.out.println("Kathmandu " + myMap.get("Nepal"));
	    System.out.println("Sydney "+ myMap.get("Australia"));

	}
	
	
	static class Entry<K,V>{
		final K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K Key, V Value, Entry<K,V> link)
		{
			this.key = Key;
			this.value = Value;
			this.next = link;
		}
		
		public String toString()
		{
			return("Key: "+ key +" Value: "+ value );
		}
		
	}

}

