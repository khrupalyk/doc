/**
 * Created by Khrupalyk on 9/28/15.
 */

var Doctors = React.createClass({

    getInitialState: function () {
        return {
            doctors: []
        };
    },

    componentDidMount: function () {

        $.get("/zocdoc/rest/doctor", function (result) {
            this.setState({
                doctors: result
            });
        }.bind(this));
    },

    render: function () {

        var doctors = this.state.doctors.map(function (doctor) {
            return <Doctor doctor = {doctor} />;
        });

        return (
            <div className="doctorsList">
                {doctors}
            </div>);
    }

});