Super String Compressor

Typical string compressors show the count of every character in the string. But in certain cases, that can actually make the string even longer! For example, 'ABC' becomes 'A1B1C1' then, double its original length.

So, my take on string compression is to only print the letter count when > 1. As you can see below, it saves a lot of space to omit counts of 1, especially when the user inputs longer strings.

Typical compressor

Input   ABBBCCDEFFFGHIIJJJJKLMMOOOPQRRRSTUUUVWXXYZZZ
Output  A1B3C2D1E1F3G1H1I2J4K1L1M2O3P1Q1R3S1T1U3V1W1X2Y1Z3


My compressor

Input   ABBBCCDEFFFGHIIJJJJKLMMOOOPQRRRSTUUUVWXXYZZZ
Output  AB3C2DEF3GHI2J4KLM2O3PQR3STU3VWX2YZ3



