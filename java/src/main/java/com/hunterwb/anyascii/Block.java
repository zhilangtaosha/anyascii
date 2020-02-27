package com.hunterwb.anyascii;

final class Block {

	static final String[][] blocks = new String[453][];

	static int block(int blockNum) {
		switch (blockNum) {
			case 0x000: return 0;
			case 0x001: return 1;
			case 0x002: return 2;
			case 0x003: return 3;
			case 0x004: return 4;
			case 0x005: return 5;
			case 0x006: return 6;
			case 0x007: return 7;
			case 0x008: return 8;
			case 0x009: return 9;
			case 0x00a: return 10;
			case 0x00b: return 11;
			case 0x00c: return 12;
			case 0x00d: return 13;
			case 0x00e: return 14;
			case 0x00f: return 15;
			case 0x010: return 16;
			case 0x011: return 17;
			case 0x012: return 18;
			case 0x013: return 19;
			case 0x014: return 20;
			case 0x015: return 21;
			case 0x016: return 22;
			case 0x017: return 23;
			case 0x018: return 24;
			case 0x019: return 25;
			case 0x01a: return 26;
			case 0x01b: return 27;
			case 0x01c: return 28;
			case 0x01d: return 29;
			case 0x01e: return 30;
			case 0x01f: return 31;
			case 0x020: return 32;
			case 0x021: return 33;
			case 0x022: return 34;
			case 0x023: return 35;
			case 0x024: return 36;
			case 0x025: return 37;
			case 0x026: return 38;
			case 0x027: return 39;
			case 0x028: return 40;
			case 0x029: return 41;
			case 0x02a: return 42;
			case 0x02b: return 43;
			case 0x02c: return 44;
			case 0x02d: return 45;
			case 0x02e: return 46;
			case 0x02f: return 47;
			case 0x030: return 48;
			case 0x031: return 49;
			case 0x032: return 50;
			case 0x033: return 51;
			case 0x034: return 52;
			case 0x035: return 53;
			case 0x036: return 54;
			case 0x037: return 55;
			case 0x038: return 56;
			case 0x039: return 57;
			case 0x03a: return 58;
			case 0x03b: return 59;
			case 0x03c: return 60;
			case 0x03d: return 61;
			case 0x03e: return 62;
			case 0x03f: return 63;
			case 0x040: return 64;
			case 0x041: return 65;
			case 0x042: return 66;
			case 0x043: return 67;
			case 0x044: return 68;
			case 0x045: return 69;
			case 0x046: return 70;
			case 0x047: return 71;
			case 0x048: return 72;
			case 0x049: return 73;
			case 0x04a: return 74;
			case 0x04b: return 75;
			case 0x04c: return 76;
			case 0x04d: return 77;
			case 0x04e: return 78;
			case 0x04f: return 79;
			case 0x050: return 80;
			case 0x051: return 81;
			case 0x052: return 82;
			case 0x053: return 83;
			case 0x054: return 84;
			case 0x055: return 85;
			case 0x056: return 86;
			case 0x057: return 87;
			case 0x058: return 88;
			case 0x059: return 89;
			case 0x05a: return 90;
			case 0x05b: return 91;
			case 0x05c: return 92;
			case 0x05d: return 93;
			case 0x05e: return 94;
			case 0x05f: return 95;
			case 0x060: return 96;
			case 0x061: return 97;
			case 0x062: return 98;
			case 0x063: return 99;
			case 0x064: return 100;
			case 0x065: return 101;
			case 0x066: return 102;
			case 0x067: return 103;
			case 0x068: return 104;
			case 0x069: return 105;
			case 0x06a: return 106;
			case 0x06b: return 107;
			case 0x06c: return 108;
			case 0x06d: return 109;
			case 0x06e: return 110;
			case 0x06f: return 111;
			case 0x070: return 112;
			case 0x071: return 113;
			case 0x072: return 114;
			case 0x073: return 115;
			case 0x074: return 116;
			case 0x075: return 117;
			case 0x076: return 118;
			case 0x077: return 119;
			case 0x078: return 120;
			case 0x079: return 121;
			case 0x07a: return 122;
			case 0x07b: return 123;
			case 0x07c: return 124;
			case 0x07d: return 125;
			case 0x07e: return 126;
			case 0x07f: return 127;
			case 0x080: return 128;
			case 0x081: return 129;
			case 0x082: return 130;
			case 0x083: return 131;
			case 0x084: return 132;
			case 0x085: return 133;
			case 0x086: return 134;
			case 0x087: return 135;
			case 0x088: return 136;
			case 0x089: return 137;
			case 0x08a: return 138;
			case 0x08b: return 139;
			case 0x08c: return 140;
			case 0x08d: return 141;
			case 0x08e: return 142;
			case 0x08f: return 143;
			case 0x090: return 144;
			case 0x091: return 145;
			case 0x092: return 146;
			case 0x093: return 147;
			case 0x094: return 148;
			case 0x095: return 149;
			case 0x096: return 150;
			case 0x097: return 151;
			case 0x098: return 152;
			case 0x099: return 153;
			case 0x09a: return 154;
			case 0x09b: return 155;
			case 0x09c: return 156;
			case 0x09d: return 157;
			case 0x09e: return 158;
			case 0x09f: return 159;
			case 0x0a0: return 160;
			case 0x0a1: return 161;
			case 0x0a2: return 162;
			case 0x0a3: return 163;
			case 0x0a4: return 164;
			case 0x0a5: return 165;
			case 0x0a6: return 166;
			case 0x0a7: return 167;
			case 0x0a8: return 168;
			case 0x0a9: return 169;
			case 0x0aa: return 170;
			case 0x0ab: return 171;
			case 0x0ac: return 172;
			case 0x0ad: return 173;
			case 0x0ae: return 174;
			case 0x0af: return 175;
			case 0x0b0: return 176;
			case 0x0b1: return 177;
			case 0x0b2: return 178;
			case 0x0b3: return 179;
			case 0x0b4: return 180;
			case 0x0b5: return 181;
			case 0x0b6: return 182;
			case 0x0b7: return 183;
			case 0x0b8: return 184;
			case 0x0b9: return 185;
			case 0x0ba: return 186;
			case 0x0bb: return 187;
			case 0x0bc: return 188;
			case 0x0bd: return 189;
			case 0x0be: return 190;
			case 0x0bf: return 191;
			case 0x0c0: return 192;
			case 0x0c1: return 193;
			case 0x0c2: return 194;
			case 0x0c3: return 195;
			case 0x0c4: return 196;
			case 0x0c5: return 197;
			case 0x0c6: return 198;
			case 0x0c7: return 199;
			case 0x0c8: return 200;
			case 0x0c9: return 201;
			case 0x0ca: return 202;
			case 0x0cb: return 203;
			case 0x0cc: return 204;
			case 0x0cd: return 205;
			case 0x0ce: return 206;
			case 0x0cf: return 207;
			case 0x0d0: return 208;
			case 0x0d1: return 209;
			case 0x0d2: return 210;
			case 0x0d3: return 211;
			case 0x0d4: return 212;
			case 0x0d5: return 213;
			case 0x0d6: return 214;
			case 0x0d7: return 215;
			case 0x0f9: return 216;
			case 0x0fa: return 217;
			case 0x0fb: return 218;
			case 0x0fc: return 219;
			case 0x0fd: return 220;
			case 0x0fe: return 221;
			case 0x0ff: return 222;
			case 0x102: return 223;
			case 0x103: return 224;
			case 0x104: return 225;
			case 0x108: return 226;
			case 0x109: return 227;
			case 0x10d: return 228;
			case 0x110: return 229;
			case 0x111: return 230;
			case 0x112: return 231;
			case 0x114: return 232;
			case 0x116: return 233;
			case 0x117: return 234;
			case 0x118: return 235;
			case 0x11c: return 236;
			case 0x11d: return 237;
			case 0x16a: return 238;
			case 0x16b: return 239;
			case 0x1b0: return 240;
			case 0x1b1: return 241;
			case 0x1d4: return 242;
			case 0x1d5: return 243;
			case 0x1d6: return 244;
			case 0x1d7: return 245;
			case 0x1e1: return 246;
			case 0x1e2: return 247;
			case 0x1e9: return 248;
			case 0x1ee: return 249;
			case 0x1f0: return 250;
			case 0x1f1: return 251;
			case 0x1f2: return 252;
			case 0x1f3: return 253;
			case 0x1f4: return 254;
			case 0x1f5: return 255;
			case 0x1f6: return 256;
			case 0x1f9: return 257;
			case 0x200: return 258;
			case 0x201: return 259;
			case 0x202: return 260;
			case 0x203: return 261;
			case 0x204: return 262;
			case 0x205: return 263;
			case 0x206: return 264;
			case 0x207: return 265;
			case 0x208: return 266;
			case 0x209: return 267;
			case 0x20a: return 268;
			case 0x20b: return 269;
			case 0x20c: return 270;
			case 0x20d: return 271;
			case 0x20e: return 272;
			case 0x20f: return 273;
			case 0x210: return 274;
			case 0x211: return 275;
			case 0x212: return 276;
			case 0x213: return 277;
			case 0x214: return 278;
			case 0x215: return 279;
			case 0x216: return 280;
			case 0x217: return 281;
			case 0x218: return 282;
			case 0x219: return 283;
			case 0x21a: return 284;
			case 0x21b: return 285;
			case 0x21c: return 286;
			case 0x21d: return 287;
			case 0x21e: return 288;
			case 0x21f: return 289;
			case 0x220: return 290;
			case 0x221: return 291;
			case 0x222: return 292;
			case 0x223: return 293;
			case 0x224: return 294;
			case 0x225: return 295;
			case 0x226: return 296;
			case 0x227: return 297;
			case 0x228: return 298;
			case 0x229: return 299;
			case 0x22a: return 300;
			case 0x22b: return 301;
			case 0x22c: return 302;
			case 0x22d: return 303;
			case 0x22e: return 304;
			case 0x22f: return 305;
			case 0x230: return 306;
			case 0x231: return 307;
			case 0x232: return 308;
			case 0x233: return 309;
			case 0x234: return 310;
			case 0x235: return 311;
			case 0x236: return 312;
			case 0x237: return 313;
			case 0x238: return 314;
			case 0x239: return 315;
			case 0x23a: return 316;
			case 0x23b: return 317;
			case 0x23c: return 318;
			case 0x23d: return 319;
			case 0x23e: return 320;
			case 0x23f: return 321;
			case 0x240: return 322;
			case 0x241: return 323;
			case 0x242: return 324;
			case 0x243: return 325;
			case 0x244: return 326;
			case 0x245: return 327;
			case 0x246: return 328;
			case 0x247: return 329;
			case 0x248: return 330;
			case 0x249: return 331;
			case 0x24a: return 332;
			case 0x24b: return 333;
			case 0x24c: return 334;
			case 0x24d: return 335;
			case 0x24e: return 336;
			case 0x24f: return 337;
			case 0x250: return 338;
			case 0x251: return 339;
			case 0x252: return 340;
			case 0x253: return 341;
			case 0x254: return 342;
			case 0x255: return 343;
			case 0x256: return 344;
			case 0x257: return 345;
			case 0x258: return 346;
			case 0x259: return 347;
			case 0x25a: return 348;
			case 0x25b: return 349;
			case 0x25c: return 350;
			case 0x25d: return 351;
			case 0x25e: return 352;
			case 0x25f: return 353;
			case 0x260: return 354;
			case 0x261: return 355;
			case 0x262: return 356;
			case 0x263: return 357;
			case 0x264: return 358;
			case 0x265: return 359;
			case 0x266: return 360;
			case 0x267: return 361;
			case 0x268: return 362;
			case 0x269: return 363;
			case 0x26a: return 364;
			case 0x26b: return 365;
			case 0x26c: return 366;
			case 0x26d: return 367;
			case 0x26e: return 368;
			case 0x26f: return 369;
			case 0x270: return 370;
			case 0x271: return 371;
			case 0x272: return 372;
			case 0x273: return 373;
			case 0x274: return 374;
			case 0x275: return 375;
			case 0x276: return 376;
			case 0x277: return 377;
			case 0x278: return 378;
			case 0x279: return 379;
			case 0x27a: return 380;
			case 0x27b: return 381;
			case 0x27c: return 382;
			case 0x27d: return 383;
			case 0x27e: return 384;
			case 0x27f: return 385;
			case 0x280: return 386;
			case 0x281: return 387;
			case 0x282: return 388;
			case 0x283: return 389;
			case 0x284: return 390;
			case 0x285: return 391;
			case 0x286: return 392;
			case 0x287: return 393;
			case 0x288: return 394;
			case 0x289: return 395;
			case 0x28a: return 396;
			case 0x28b: return 397;
			case 0x28c: return 398;
			case 0x28d: return 399;
			case 0x28e: return 400;
			case 0x28f: return 401;
			case 0x290: return 402;
			case 0x291: return 403;
			case 0x292: return 404;
			case 0x293: return 405;
			case 0x294: return 406;
			case 0x295: return 407;
			case 0x296: return 408;
			case 0x297: return 409;
			case 0x298: return 410;
			case 0x299: return 411;
			case 0x29a: return 412;
			case 0x29b: return 413;
			case 0x29c: return 414;
			case 0x29d: return 415;
			case 0x29e: return 416;
			case 0x29f: return 417;
			case 0x2a0: return 418;
			case 0x2a1: return 419;
			case 0x2a2: return 420;
			case 0x2a3: return 421;
			case 0x2a4: return 422;
			case 0x2a5: return 423;
			case 0x2a6: return 424;
			case 0x2a7: return 425;
			case 0x2a8: return 426;
			case 0x2aa: return 427;
			case 0x2ad: return 428;
			case 0x2ae: return 429;
			case 0x2af: return 430;
			case 0x2b0: return 431;
			case 0x2b1: return 432;
			case 0x2b2: return 433;
			case 0x2b3: return 434;
			case 0x2b4: return 435;
			case 0x2b5: return 436;
			case 0x2b6: return 437;
			case 0x2b8: return 438;
			case 0x2bf: return 439;
			case 0x2c1: return 440;
			case 0x2c4: return 441;
			case 0x2c6: return 442;
			case 0x2c7: return 443;
			case 0x2c9: return 444;
			case 0x2cb: return 445;
			case 0x2ce: return 446;
			case 0x2d0: return 447;
			case 0x2e5: return 448;
			case 0x2f8: return 449;
			case 0x2f9: return 450;
			case 0x2fa: return 451;
			case 0xe00: return 452;
			default: return -1;
		}
	}
}
