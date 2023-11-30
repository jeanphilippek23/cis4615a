#Install curl & NodeJS
sudo apt install curl |tee -a install.log
curl -sL https://deb.nodesource.com/setup_13.x | sudo -E bash - |tee -a install.log
sudo apt-get install -y nodejs |tee -a install.log

sudo npm update |tee -a install.log
sudo npm i -g snyk |tee -a install.log
sudo chown $USER -R ~/.config |tee -a install.log

echo "Sign in to your GitHub account"
echo "When complete then enter the command:"
echo "snyk auth"
echo "Then follow thru with the snyk CLI registration"
echo "This will complete the nodeJS and snyk installation."
