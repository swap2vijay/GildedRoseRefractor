package com.exercise.gildedrose;

public class GlidedRose {

    // Update the quality , based on the given Items
    public static void updateQuality(Item[] items) {

        for (Item item : items) {
            if (!item.name.equals("Sulfuras")) {
                item.sellIn--;

                switch (item.name) {
                    case "Aged Brie":
                        updateAgedBrie(item);
                        break;
                    case "Backstage passes":
                        updateBackstagePasses(item);
                        break;
                    case "Conjured":
                        updateConjured(item);
                        break;
                    default:
                        updateNormalItem(item);
                        break;
                }
            }
        }
    }

    // To update the Normal Item
    private static void updateNormalItem(Item item) {
        int qualityChange = (item.sellIn < 0) ? 2 : 1;
        if (item.quality > 0) {
            item.quality -= qualityChange;
        }
    }

    // To update the AgedBrieItem
    private static void updateAgedBrie(Item item) {
        int qualityChange = (item.sellIn < 0) ? 2 : 1;
        if (item.quality < 50) {
            item.quality += qualityChange;
        }

    }

    // To update the BackstagePasses Item
    private static void updateBackstagePasses(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            item.quality += 3;
        } else if (item.sellIn <= 10) {
            item.quality += 2;
        } else {
            item.quality++;
        }

        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    // To update the Conjured Item
    private static void updateConjured(Item item) {
        int qualityChange = (item.sellIn < 0) ? 4 : 2;
        if (item.quality > 0) {
            item.quality -= qualityChange;
        }

    }
}