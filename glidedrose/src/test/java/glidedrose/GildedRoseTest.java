package glidedrose;

import org.junit.jupiter.api.Test;

import com.exercise.gildedrose.GlidedRose;
import com.exercise.gildedrose.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest  {
    
	 @Test
	    void updateQuality_AgedBrie() {
	        Item[] items = new Item[]{new Item("Aged Brie", 5, 10)};
	        GlidedRose gildedRose = new GlidedRose(items);

	        gildedRose.updateQuality();

	        assertEquals(4, items[0].sellIn);
	        assertEquals(11, items[0].quality);
	    }

	    @Test
	    void updateQuality_BackstagePasses() {
	        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
	        GlidedRose gildedRose = new GlidedRose(items);

	        gildedRose.updateQuality();

	        assertEquals(14, items[0].sellIn);
	        assertEquals(21, items[0].quality);
	    }

	    @Test
	    void updateQuality_Sulfuras() {
	        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
	        GlidedRose gildedRose = new GlidedRose(items);

	        gildedRose.updateQuality();

	        assertEquals(0, items[0].sellIn);
	        assertEquals(80, items[0].quality);
	    }

	    @Test
	    void updateQuality_Conjured() {
	        Item[] items = new Item[]{new Item("Conjured", 3, 6)};
	        GlidedRose gildedRose = new GlidedRose(items);

	        gildedRose.updateQuality();

	        assertEquals(2, items[0].sellIn);
	        assertEquals(5, items[0].quality);
	    }

}
