# Seed Cipher

Improvement from the basic [Caesar cipher](https://github.com/GazaliAhmad/encoder), the seed cipher is a simple substitution cipher that uses a seed to generate a random key. The seed is used to generate a random key, which is then used to encrypt the message. The seed is then used to decrypt the message.

If the words are repeated, the encrypted words are not the same. So it's not a one-to-one mapping and becomes a lot more difficult to crack.

For example, to encrypt the message `sunny sunny sunny`, the encrypted message would be `ÈÎ½ÌËi¾ÐÃºÃwÑ½ÉµÑ` and the randomly generated key is `osixlceuofdqxbuar`.

With the basic Caesar cipher, the encrypted message would be `LNGGR LNGGR LNGGR` with a key of `h`. So it's extremely easy to crack.