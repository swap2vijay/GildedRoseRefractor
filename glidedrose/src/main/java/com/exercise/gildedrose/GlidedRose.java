package com.exercise.gildedrose;

import java.util.Arrays;

public class GlidedRose { 
	
	Item[] items;

    public GlidedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.asList(items).forEach(item -> {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                updateItemQuality(item);
                updateSellIn(item);
                updateQualityAfterSellByDate(item);
            }
        });
    }

    private void updateItemQuality(Item item) {
        if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            increaseQuality(item);
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    increaseQuality(item);
                }
                if (item.sellIn < 6) {
                    increaseQuality(item);
                }
            }
        } else {
            decreaseQuality(item);
        }
    }

    private void updateSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }
    }

    private void updateQualityAfterSellByDate(Item item) {
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    decreaseQuality(item);
                } else {
                    item.quality = 0;
                }
            } else {
                increaseQuality(item);
            }
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality--;
        }
    }
}