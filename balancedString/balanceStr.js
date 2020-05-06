const balancedStringSplit = function (s) {
	let counter = 0;
	let balancedCount = 0;

	for (let i = 0; i < s.length; i++) {
		let char = s[i];

		if (char === 'L') {
			counter++;
		} else if (char === 'R') {
			counter--;
		}

		if (counter === 0) {
			balancedCount++;
		}
	}
	return balancedCount;
};

balancedCount('RLRRLLRLRL'); // 4


