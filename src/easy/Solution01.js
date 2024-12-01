/**
 * 
 */
function numSetBits(num) {
	let count = 0;
	
	if(num == 0) return 0;
	
	while(num>0) {
		if((num&1) == 1) {
			count++;
		}
		num = num >> 1;
	}
	return count;
}