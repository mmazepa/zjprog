package com.gildedrose;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.Test;

public class GildedRoseTest {

    // TEST 1:
    // Exemplary test.
    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        // assertEquals("fixme", app.items[0].name);
        assertEquals("foo", app.items[0].name);
    }

    // TEST 2:
    // Once the sell by date has passed, Quality degrades twice as fast.
    @Test
    public void checkQualityAfterPass() {
      int quality = 10;
      Item[] items = new Item[] { new Item("Item", -5, quality) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality, quality-2);
    }

    // TEST 3:
    // The Quality of an item is never negative.
    @Test
    public void checkQualityNegative() {
      Item[] items = new Item[] { new Item("Item", 0, -4) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality >= 0, true);
    }

    // TEST 4:
    // "Aged Brie" actually increases in Quality the older it gets.
    @Test
    public void checkQualityOfAgedBrie() {
      int quality = 25;
      Item[] items = new Item[] {
        new Item("Aged Brie", -5, quality),
        new Item("Aged Brie", -10, quality)
      };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality > quality, true);
      assertEquals(app.items[1].quality > quality, true);
    }

    // TEST 5:
    // The Quality of an item is never more than 50.
    @Test
    public void checkQualityMoreThan50() {
      Item[] items = new Item[] { new Item("Item", 0, 100) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality <= 50, true);
    }

    // TEST 6:
    // "Sulfuras", being a legendary item, never has to be sold
    // or decreases in Quality.
    @Test
    public void checkSulfuras() {
      Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 25) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].name, "Sulfuras, Hand of Ragnaros");
      assertEquals(app.items[0].sellIn, 0);
      assertEquals(app.items[0].quality, 80);
    }

    // TEST 7:
    // "Backstage passes", like aged brie, increases in Quality
    // as its SellIn value approaches.
    @Test
    public void checkQualityOfBackstagePasses() {
      Item[] items = new Item[] {
        new Item("Backstage passes to a TAFKAL80ETC concert", 0, 100)
      };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].name.equals("Backstage passes to a TAFKAL80ETC concert"), true);
      if (app.items[0].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        // assertEquals(app.items[0].quality, ???);
      }
    }

    // TEST 8:
    // Quality increases by 2 when there are 10 days or less
    // and by 3 when there are 5 days or less
    // but Quality drops to 0 after the concert.
    @Test
    public void checkQualityByDays() {
      Item[] items = new Item[] {
        new Item("Item 1", 10, 10),
        new Item("Item 2", 7, 10),
        new Item("Item 3", 5, 10),
        new Item("Item 4", 3, 10)
      };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality, 10+2);
      assertEquals(app.items[1].quality, 10+2);
      assertEquals(app.items[2].quality, 10+3);
      assertEquals(app.items[3].quality, 10+3);
    }

    // TEST 9:
    // "Conjured" items degrade in Quality twice as fast as normal items
    @Test
    public void checkConjuredQuality() {
      int quality = 10;
      Item[] items = new Item[] {
        new Item("Conjured Item", 25, quality),
        new Item("Conjured Item", -1, quality)
      };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(app.items[0].quality, quality-2);
      assertEquals(app.items[1].quality, quality-4);
    }

}
