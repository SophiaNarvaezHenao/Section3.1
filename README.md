# Section3.1




# Flowchart



<img width="911" height="551" alt="Notifications" src="https://github.com/user-attachments/assets/934c6625-a76a-45ef-8982-a76b2228f9cd" />







# class diagram







# Psedocode

BEGIN

    CREATE scanner
    CREATE empty list of Notifier

    ADD EmailNotifier to list
    ADD SMSNotifier to list
    ADD PushNotifier to list

    CREATE AlertManager with list of notifiers

    PRINT introduction messages
    PRINT suspects list (1–5)

    READ userOption

    SWITCH userOption
        CASE "1":
            CALL AlertManager.triggerMaximumAlert(
                "We are disabling all your devices, and the FBI is surrounding your house.",
                "William Afton"
            )
        CASE "2":
            CALL AlertManager.triggerMaximumAlert(
                message,
                "King Bowser Koopa"
            )
        CASE "3":
            CALL AlertManager.triggerMaximumAlert(
                message,
                "Mojo Jojo"
            )
        CASE "4":
            CALL AlertManager.triggerMaximumAlert(
                message,
                "Team Rocket"
            )
        CASE "5":
            CALL AlertManager.triggerMaximumAlert(
                message,
                "Doctor Eggman"
            )
        DEFAULT:
            PRINT "Invalid option. Exiting."
            END PROGRAM
    END SWITCH

END


-------------------------------------------
CLASS AlertManager

    CONSTRUCTOR AlertManager(notifierList)
        STORE notifierList

    METHOD triggerMaximumAlert(message, recipient)
        PRINT "WARNING: MAXIMUM ALERT ACTIVATED"
        FOR each notifier IN notifierList
            CALL notifier.send(message, recipient)
        END FOR
END CLASS


-------------------------------------------
INTERFACE Notifier
    METHOD send(message, recipient)
-------------------------------------------


CLASS EmailNotifier IMPLEMENTS Notifier
    METHOD send(message, recipient)
        PRINT "Sending an email to [recipient]: [message]"

CLASS SMSNotifier IMPLEMENTS Notifier
    METHOD send(message, recipient)
        PRINT "Sending an SMS to [recipient]: [message]"

CLASS PushNotifier IMPLEMENTS Notifier
    METHOD send(message, recipient)
        PRINT "Sending a PUSH notification to [recipient]: [message]"
