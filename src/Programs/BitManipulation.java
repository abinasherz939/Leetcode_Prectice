package Programs;

public class BitManipulation {
}
/****
 *
 *
 * BIT HACKS:
 * 0> binary numbers are 0 indexed
 * REMEMBER left shifting a number by i multiplies that number with 2^i
 * and right shifting by i divides it by 2^i
 *
 * 1>N-1 INVERTS EVERY BIT STARTING FROM RIGHTMOST ONE till INDEX ‘0’
 * IF N=0b00000110
 * N-1=0b00000101
 *
 * 2> 1<<i
 * left shifts 1 by i positions
 * 1>>i
 * right shifts 1 by i positions
 *
 * 3>whenever we want to toggle ,set,unset ith bit of a number we always use 1 as our helper with different operators
 * 3.1>
 * toggle ith bit:toggling means 1->0 and 0->1
 * 1ST STEP: left shift 1 to the position where we want to toggle
 * 2ND STEP: we have taken the 1 to the ith bit(remember all rest are 0s) then we need to make it a 1 if its a zero and make it 0 if its a one
 * 3RD STEP: so we have the 1 fixed ,using this we need to make 0->1 or 1->0
 * if we do '&'
 * 0&1=0(incorrect)
 * 1&1=1(incorrect)
 *
 * '|'
 * 0|1=1(correct)
 * 1|1=1(incorrect)
 *
 * '^'
 * 0^1=1(correct)
 * 1^1=0(correct)
 *
 * hence we could only do xor(^)
 *
 * 3.2>
 * set ith bit(means make the ith bit 0->1)
 *
 * we again use 1<<i to reach the ith position
 * then we do '|' with 1<<i
 * therefore if bit was 0 it becomes 1
 * if it was already 1 then it still remains 1
 * NOTE-USING XOR IS NOT RECOMMENDED ,BECAUSE IF THE ith BIT IS ALREADY SET THEN XOR WILL GIVE WRONG RESULT!
 *
 * 3.3>
 * unset/clear ith bit (make 1->0)
 *
 * we need again the 1<<i to reach the ith position
 * now we do a negation ~ to this 1 we took so that the 1 in our 1 initially becomes 0 and every other bit becomes 1
 * suppose i=3
 * we do 1<<3 to get
 * 0b00000001->0b00001000
 * then ~ gives
 * 0b00001000->0b11110111
 * so we have ith bit if our 1 as 0 and rest 1
 * now we just & it with the number whose ith bit is to be unset!
 *
 * Checking if bit at nth position is set or unset:
 * Left shift ‘1’ to given position and then ‘AND'(‘&’).
 * Some more quick hacks:
 *
 * 5>Inverting every bit of a number/1’s complement:
 * If we want to invert every bit of a number i.e change bit ‘0’ to ‘1’ and bit ‘1’ to ‘0’.We can do this with the help of ‘~’ operator. For example : if number is num=00101100 (binary representation) so ‘~num’ will be ‘11010011’.
 *
 * This is also the ‘1s complement of number’.
 * 6>
 * Two’s complement of the number: 2’s complement of a number is 1’s complement + 1.
 * So formally we can have 2’s complement by finding 1s complement and adding 1 to the result i.e (~num+1)
 *
 * 7>**Stripping off the lowest set bit **:
 * In many situations we want to strip off the lowest set bit for example in Binary Indexed tree data structure, counting number of set bit in a number.
 *
 * We do like this:
 *
 * X = X & (X-1)
 *
 * Let us see this by taking an example, let X = 1100.
 *
 * (X-1) inverts all the bits till it encounter lowest set ‘1’ and it also invert that lowest set ‘1’.
 *
 * X-1 becomes 1011. After ‘ANDing’ X with X-1 we get lowest set bit stripped.
 *
 * 8>Getting lowest set bit of a number:
 * This is done by using expression ‘X &(-X)’Let us see this by taking an example:Let X = 00101100.
 * So ~X(1’s complement) will be ‘11010011’ and 2’s complement will be (~X+1 or -X) i.e ‘11010100’.
 * So if we ‘AND’ original number ‘X’ with its two’s complement which is ‘-X’, we get lowest set bit.
 *
 * SOME MORE IMPORTANT HACKS:
 * x&1 gives the lowest bit(helps in finding whether number is even or odd i.e if last bit is 0 then it is even otherwise odd)
 * x & (x-1) will clear the lowest set bit of x
 * x & ~(x-1) extracts the lowest set bit of x (all others are clear). Pretty patterns when applied to a linear sequence.
 * x & (x + (1 0<< n)) = x, with the run of set bits (possibly length 0) starting at bit n cleared.
 * x & ~(x + (1 << n)) = the run of set bits (possibly length 0) in x, starting at bit n.
 * x | (x + 1) = x with the lowest cleared bit set.
 * x | ~(x + 1) = extracts the lowest cleared bit of x (all others are set).
 * x | (x - (1 << n)) = x, with the run of cleared bits (possibly length 0) starting at bit n set.
 * x | ~(x - (1 << n)) = the lowest run of cleared bits (possibly length 0) in x, starting at bit n are the only clear bits.
 *
 * FEEL FREE TO ADD ANYTHING THAT YOU FELL LIKE IS MISSING FROM THIS POST!
 *
 * HOPE IT HELPS!
 *
 *
 *
 * ****/