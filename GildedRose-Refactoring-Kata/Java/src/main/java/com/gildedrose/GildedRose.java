package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Boolean isInRange(int value, int min, int max)
    {
      if (value > min && value < max) return true;
      else return false;
    }

    public Item updateQuality(Item item, int by) {
      item.quality = item.quality + by;
      return item;
    }

    public Item updateAgedBrie(Item item) {
      if (item.quality < 50)
        item = updateQuality(item, 1);
        return item;
    }

    public Item updateBackstagePasses(Item item) {
      if (item.quality < 50)
      {
        if (isInRange(item.sellIn, 5, 11)) {
          item = updateQuality(item, 2);
        } else if (isInRange(item.sellIn, 0, 6)) {
          item = updateQuality(item, 3);
        } else if (item.sellIn == 0) {
          item.quality = 0;
        }
      }
      return item;
    }

    public Item updateSulfuras(Item item) {
      item.sellIn = 0;
      item.quality = 80;
      return item;
    }

    public Item updateNotSpecialItem(Item item) {
      if (item.quality > 0) {
        int multiplier = 1;
        if (item.name.contains("Conjured")) multiplier = 2;
        item = updateConjuredOrNot(item, multiplier);
      }
      return item;
    }

    public Item updateConjuredOrNot(Item item, int multiplier)
    {
      if (item.sellIn > 0) item = updateQuality(item, -1 * multiplier);
      else item = updateQuality(item, -2 * multiplier);
      return item;
    }

    public Item updateSellInAndCheckQuality(Item item)
    {
      if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
        item.sellIn = item.sellIn - 1;
        if (item.quality < 0)
          item.quality = 0;
        else if (item.quality > 50)
          item.quality = 50;
      }
      return item;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
              case "Aged Brie":
                items[i] = updateAgedBrie(items[i]);
                break;
              case "Backstage passes to a TAFKAL80ETC concert":
                items[i] = updateBackstagePasses(items[i]);
                break;
              case "Sulfuras, Hand of Ragnaros":
                items[i] = updateSulfuras(items[i]);
                break;
              default:
                items[i] = updateNotSpecialItem(items[i]);
                break;
            }
            items[i] = updateSellInAndCheckQuality(items[i]);
        }
    }
}
