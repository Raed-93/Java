import java.util.HashMap;
import java.util.Set;
class Raed {
    public static void main(String []args){
        HashMap <String , String> trackList = new HashMap <String , String>();
        trackList.put("Track: " + "Bad Liar", "Lyrics: " + "Oh, hush, my dear, it's been a difficult year\r\n" + //
                "And terrors don't prey on innocent victims\r\n" + //
                "Trust me, darlin', trust me darlin'\r\n" + //
                "It's been a loveless year\r\n" + //
                "I'm a man of three fears\r\n" + //
                "Integrity, faith and crocodile tears\r\n" + //
                "Trust me, darlin', trust me, darlin'\r\n" + //
                "Look me in the eyes, tell me what you see\r\n" + //
                "Perfect paradise, tearin' at the seams\r\n" + //
                "I wish I could escape it, I don't wanna fake it\r\n" + //
                "Wish I could erase it, make your heart believe\r\n" + //
                "But I'm a bad liar, bad liar\r\n" + //
                "Now you know, now you know\r\n" + //
                "I'm a bad liar, bad liar\r\n" + //
                "Now you know, you're free to go\r\n" + //
                "Did all my dreams never mean one thing?\r\n" + //
                "Does happiness lie in a diamond ring?\r\n" + //
                "Oh, I've been asking for...\r\n" + //
                "Oh, I've been asking for problems, problems, problems\r\n" + //
                "I wage my war, on the world inside\r\n" + //
                "I take my gun to the enemy's side\r\n" + //
                "Oh, I've been asking for...\r\n" + //
                "Oh, I've been asking for problems, problems, problems\r\n" + //
                "Look me in the eyes, tell me what you see\r\n" + //
                "Perfect paradise, tearin' at the seams\r\n" + //
                "I wish I could escape it, I don't wanna fake it\r\n" + //
                "Wish I could erase it, make your heart believe\r\n" + //
                "But I'm a bad liar, bad liar\r\n" + //
                "Now you know, now you know\r\n" + //
                "I'm a bad liar, bad liar\r\n" + //
                "Now you know, you're free to go\r\n" + //
                "I can't breathe, I can't be\r\n" + //
                "I can't be what you want me to be\r\n" + //
                "Believe me, this one time\r\n" + //
                "Believe me\r\n" + //
                "I'm a bad liar, bad liar\r\n" + //
                "Now you know, now you know\r\n" + //
                "I'm a bad liar, bad liar\r\n" + //
                "Now you know, you're free to go\r\n" + //
                "Oh-oh-oh\r\n" + //
                "Please believe me\r\n" + //
                "Please believe me");

        trackList.put("Track: " + "Whatever It Takes", "Lyrics :" + "Falling too fast to prepare for this\r\n" + //
                "Tripping in the world could be dangerous\r\n" + //
                "Everybody circling is vulturous\r\n" + //
                "Negative, nepotist\r\n" + //
                "Everybody waiting for the fall of man\r\n" + //
                "Everybody praying for the end of times\r\n" + //
                "Everybody hoping they could be the one\r\n" + //
                "I was born to run, I was born for this\r\n" + //
                "Whip, whip\r\n" + //
                "Run me like a racehorse\r\n" + //
                "Hold me like a ripcord\r\n" + //
                "Break me down and build me up\r\n" + //
                "I wanna be the slip, slip\r\n" + //
                "Word upon your lip, lip\r\n" + //
                "Letter that you rip, rip\r\n" + //
                "Break me down and build me up\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do whatever it takes\r\n" + //
                "'Cause I love how it feels when I break the chains\r\n" + //
                "Whatever it takes\r\n" + //
                "Yeah, take me to the top, I'm ready for\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do what it takes\r\n" + //
                "Always had a fear of being typical\r\n" + //
                "Looking at my body, feeling miserable\r\n" + //
                "Always hanging on to the visual\r\n" + //
                "I wanna be invisible\r\n" + //
                "Looking at my years like a martyrdom\r\n" + //
                "Everybody needs to be a part of 'em\r\n" + //
                "Never be enough, I'm the prodigal son\r\n" + //
                "I was born to run, I was born for this\r\n" + //
                "Whip, whip\r\n" + //
                "Run me like a racehorse\r\n" + //
                "Hold me like a ripcord\r\n" + //
                "Break me down and build me up\r\n" + //
                "I wanna be the slip, slip\r\n" + //
                "Word upon your lip, lip\r\n" + //
                "Letter that you rip, rip\r\n" + //
                "Break me down and build me up\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do whatever it takes\r\n" + //
                "'Cause I love how it feels when I break the chains\r\n" + //
                "Whatever it takes\r\n" + //
                "Yeah, take me to the top, I'm ready for\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do what it takes\r\n" + //
                "Hypocritical, egotistical\r\n" + //
                "Don't wanna be the parenthetical\r\n" + //
                "Hypothetical, working onto something that I'm proud of\r\n" + //
                "Out of the box, an epoxy to the world and the vision we've lost\r\n" + //
                "I'm an apostrophe, I'm just a symbol to remind you that there's more to see\r\n" + //
                "I'm just a product of the system of catastrophe\r\n" + //
                "And yet a masterpiece, and yet I'm half diseased\r\n" + //
                "And when I am deceased\r\n" + //
                "At least I'll go down to the grave and die happily\r\n" + //
                "Leave the body of my soul to be a part of thee\r\n" + //
                "I do what it takes\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do whatever it takes\r\n" + //
                "'Cause I love how it feels when I break the chains\r\n" + //
                "Whatever it takes\r\n" + //
                "Yeah, take me to the top, I'm ready for\r\n" + //
                "Whatever it takes\r\n" + //
                "'Cause I love the adrenaline in my veins\r\n" + //
                "I do what it takes");

        trackList.put("Track: " + "Natural", "Lyrics: " + "Will you hold the line\r\n" + //
                "When every one of them has given up and given in? Tell me\r\n" + //
                "In this house of mine\r\n" + //
                "Nothing ever comes without a consequence or cost, tell me\r\n" + //
                "Will the stars align?\r\n" + //
                "Will heaven step in? Will it save us from our sin, will it?\r\n" + //
                "'Cause this house of mine stands strong\r\n" + //
                "That's the price you pay\r\n" + //
                "Leave behind your heart and cast away\r\n" + //
                "Just another product of today\r\n" + //
                "Rather be the hunter than the prey\r\n" + //
                "And you're standing on the edge face up\r\n" + //
                "'Cause you're a natural\r\n" + //
                "A beating heart of stone\r\n" + //
                "You gotta be so cold\r\n" + //
                "To make it in this world\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Living your life cutthroat\r\n" + //
                "You gotta be so cold\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Will somebody\r\n" + //
                "Let me see the light within the dark trees shadowing?\r\n" + //
                "What's happening?\r\n" + //
                "Looking through the glass find the wrong within the past knowing\r\n" + //
                "Oh, we are the youth\r\n" + //
                "Cut until it bleeds inside a world without the peace, face it\r\n" + //
                "A bit of the truth, the truth\r\n" + //
                "That's the price you pay\r\n" + //
                "Leave behind your heart and cast away\r\n" + //
                "Just another product of today\r\n" + //
                "Rather be the hunter than the prey\r\n" + //
                "And you're standing on the edge face up\r\n" + //
                "'Cause you're a natural\r\n" + //
                "A beating heart of stone\r\n" + //
                "You gotta be so cold\r\n" + //
                "To make it in this world\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Living your life cutthroat\r\n" + //
                "You gotta be so cold\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Deep inside me, I'm fading to black, I'm fading\r\n" + //
                "Took an oath by the blood on my hand, won't break it\r\n" + //
                "I can taste it, the end is upon us, I swear\r\n" + //
                "Gonna make it\r\n" + //
                "I'm gonna make it\r\n" + //
                "Natural\r\n" + //
                "A beating heart of stone\r\n" + //
                "You gotta be so cold\r\n" + //
                "To make it in this world\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Living your life cutthroat\r\n" + //
                "You gotta be so cold\r\n" + //
                "Yeah, you're a natural\r\n" + //
                "Natural\r\n" + //
                "Yeah, you're a natural");

        trackList.put("Track: " + "Wrecked","Lyrics: " + "Days pass by and my eyes stay dry, and I think that I'm okay\r\n" + //
                "'Til I find myself in conversation, fading away\r\n" + //
                "The way you smile, the way you walk\r\n" + //
                "The time you took to teach me all that you had taught\r\n" + //
                "Tell me, how am I supposed to move on?\r\n" + //
                "These days I'm becoming everything that I hate\r\n" + //
                "Wishing you were around but now it's too late\r\n" + //
                "My mind is a place that I can't escape your ghost\r\n" + //
                "Sometimes I wish that I could wish it all away\r\n" + //
                "One more rainy day without you\r\n" + //
                "Sometimes I wish that I could see you one more day\r\n" + //
                "One more rainy day\r\n" + //
                "Oh, I'm a wreck without you here\r\n" + //
                "Yeah, I'm a wreck since you've been gone\r\n" + //
                "I've tried to put this all behind me\r\n" + //
                "I think I was wrecked all along\r\n" + //
                "Yeah, I'm a wreck\r\n" + //
                "They say that the time will heal it, the pain will go away\r\n" + //
                "But everything, it reminds me of you and it comes in waves\r\n" + //
                "Way you laugh when your shoulders shook\r\n" + //
                "The time you took to teach me all that you had taught\r\n" + //
                "Tell me, how am I supposed to move on?\r\n" + //
                "These days I'm becoming everything that I hate\r\n" + //
                "Wishing you were around but now it's too late\r\n" + //
                "My mind is a place that I can't escape your ghost\r\n" + //
                "Sometimes I wish that I could wish it all away\r\n" + //
                "One more rainy day without you\r\n" + //
                "Sometimes I wish that I could see you one more day\r\n" + //
                "One more rainy day\r\n" + //
                "Oh, I'm a wreck without you here\r\n" + //
                "Yeah, I'm a wreck since you've been gone\r\n" + //
                "I've tried to put this all behind me\r\n" + //
                "I think I was wrecked all along\r\n" + //
                "These days when I'm on the brink of the edge\r\n" + //
                "Remember the words that you said\r\n" + //
                "Remember the life you led\r\n" + //
                "You'd say, \"Oh, suck it all up, don't get stuck in the mud\r\n" + //
                "Thinkin' of things that you should have done\"\r\n" + //
                "I'll see you again, my loved one\r\n" + //
                "I'll see you again, my loved one\r\n" + //
                "Yeah, I'm a wreck\r\n" + //
                "I'll see you again, my loved one\r\n" + //
                "Yeah, I'm a wreck without you here (loved one)\r\n" + //
                "Yeah, I'm a wreck since you've been gone (I'm a wreck since you've been gone)\r\n" + //
                "I've tried to put this all behind me\r\n" + //
                "I think I was wrecked all along (I'm a wreck)\r\n" + //
                "Yeah, I'm a wreck\r\n" + //
                "Sometimes I wish that I could wish it all away but I can't\r\n" + //
                "One more rainy day without you (one more rainy day)\r\n" + //
                "Sometimes I wish that I could see you one more day but I can't");

                // String song = trackList.get("Wrecked");
                // System.out.println(song);
                Set <String> songs = trackList.keySet();
                for(String s : songs){
                        System.out.println(s);
                        System.out.println(trackList.get(s));

                }


    }
}