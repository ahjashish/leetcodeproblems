var defangIPaddr = function (address) {
	// one solution
	let result = '';

	for (let i = 0; i < address.length; i++) {
		let char = address[i];

		if (char === '.') {
			result += '[.]';
		} else {
			result += address[i];
		}
	}
	return result;

	// one liner solution
	return address.replace(/[.]/g, '.');
};
defangIPaddr('1.1.1.1');
