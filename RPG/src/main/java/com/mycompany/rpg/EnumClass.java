package com.mycompany.rpg;
import com.mycompany.rpg.gameClasses.Avatar;
import com.mycompany.rpg.gameClasses.Brawler;
import com.mycompany.rpg.gameClasses.Knight;
import com.mycompany.rpg.gameClasses.Mage;
import com.mycompany.rpg.gameClasses.Priest;

public enum EnumClass {
    KNIGHT {
        @Override
        public Avatar create(String name) {
            return new Knight(name);
        }
    },
    MAGE {
        @Override
        public Avatar create(String name) {
            return new Mage(name);
        }
    },
    BRAWLER {
        @Override
        public Avatar create(String name) {
            return new Brawler(name);
        }
    },
    PRIEST {
        @Override
        public Avatar create(String name) {
            return new Priest(name);
        }
    };

    public abstract Avatar create(String name);
}


