package glidedrose;

import org.junit.jupiter.api.Test;

import com.exercise.gildedrose.GlidedRose;
import com.exercise.gildedrose.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest  {
    
    @Test
    public void testUpdateQuality() {
        // Arrange
        Item[] items = new Item[] {
            new Item("Normal Item", 5, 10),
            new Item("Aged Brie", 3, 20),
            new Item("Backstage passes", 15, 30),
            new Item("Sulfuras", 0, 80),
            new Item("Conjured", 7, 15) 
        };

        // Act
        GlidedRose.updateQuality(items);

        // Assert
        assertEquals(9, items[0].quality); // Normal Item
        assertEquals(21, items[1].quality); // Aged Brie
        assertEquals(31, items[2].quality); // Backstage passes
        assertEquals(80, items[3].quality); // Sulfuras
        assertEquals(13, items[4].quality); // Conjured
    }
}
