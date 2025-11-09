data = readtable("results.csv");
meanValues = mean(data);

dice1 = data.Dice1;
dice1_counts = histcounts(dice1, 1:(max(dice1)+1));

dice2 = data.Dice2;
dice2_counts = histcounts(dice2, 1:(max(dice1)+1));

dice3 = data.Dice3;
dice3_counts = histcounts(dice3, 1:(max(dice1)+1));

dice4 = data.Dice4;
dice4_counts = histcounts(dice4, 1:(max(dice1)+1));



bar(1:6,dice1_counts);

