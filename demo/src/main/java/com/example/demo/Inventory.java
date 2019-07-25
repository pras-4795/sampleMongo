package com.example.demo;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Inventory {
	
	@Id
    private String id;

    private String item;
    private int qty;
    private ArrayList<String> tags;
    private ArrayList<Object> size;
    
    public Inventory(String item) {
        setItem(item);
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	public ArrayList<Object> getSize() {
		return size;
	}
	public void setSize(ArrayList<Object> size) {
		this.size = size;
	}
    
	@Override
    public String toString() {
        return String.format(
                "Inventory [id=%s, item='%s', qty='%s', tags='%s', size='%s']",
                getId(), getItem(), getQty(), getTags(), getSize());
    }
    

}
